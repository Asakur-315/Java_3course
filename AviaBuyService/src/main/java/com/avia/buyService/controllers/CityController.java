import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.avia.buyService.repositories.CityRepository;

@Controller
public class CityController{
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/cities")
}