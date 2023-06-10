package com.exam.shopwarehouse;

import com.exam.shopwarehouse.Good;
import com.exam.shopwarehouse.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsRepository goodsRepository;

    @GetMapping
    public String main(Model model){
        List<Good> goods = goodsRepository.findAll();
        int size = goods.size();
        if (size != 0){
            model.addAttribute("goods", goods);
        }
        model.addAttribute("size", size);
        return "goods";
    }
    @GetMapping("/add")
    public String showToAdd(){
        return "addGood";
    }
    @PostMapping("/add")
    public String addUser(@RequestParam String name, String quantity){
        Good good = new Good();
        try {
            good.setQuantity(Integer.parseInt(quantity));
        }
        catch (NumberFormatException exception){
        }
        good.setName(name);
        return "redirect:/goods";
    }
    @GetMapping("{id}")
    public String userEditForm(@PathVariable Integer id, Model model){
        Good good = goodsRepository.findByid(id);
        if (good != null){
            model.addAttribute("good", good);
        }
        return "goodEdit";
    }
    @PostMapping
    public String editGood(
            @RequestParam Map<String, String> form,
            @RequestParam("goodId") Good good){
        if (form.get("quantity").equals("")){
            good.setQuantity(null);
        }
        else {
            try {
                good.setQuantity(Integer.parseInt(form.get("quantity")));
            }
            catch (NumberFormatException exception){

            }
        }
        good.setName(form.get("name"));
        return "redirect:/goods";
    }
    @GetMapping("/del/{id}")
    public String deleteGood(@PathVariable Integer id){
        Good good = goodsRepository.findByid(id);
        if (good != null){
            goodsRepository.deleteById(good.getId());
        }
        else {
            System.out.println("Нет такого товара");
        }
        return "redirect:/goods";
    }
}
