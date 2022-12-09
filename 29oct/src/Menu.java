import java.util.ArrayList;

public class Menu {
    private ArrayList<Meal> meals = new ArrayList<>();

    public Menu(){
        meals.add (new Meal("Паста Болоньезе",true,400,false,"гр",400,"Макароны, томатный соус, фарш"));
        meals.add (new Meal("Пицца Маргарита",true,900,false,"см",30,"Тесто, томатный соус, сыр"));
        meals.add (new Meal("Лазанья",false,900,false,"гр",340,"Тесто, овощи, фарш, спайсы"));
        meals.add (new Meal("Пиво",true,150,true,"Кружка",1,"Хмель, солод"));
        meals.add (new Meal("Вино",false,250,true,"бокал",1,"Виноград"));
    }

    public void show(){
        
        int i = 0;
        for (Meal meal : meals) {
            System.out.println(String.format("%d: %s - %s",i+1, meal.getName(), outAvailability(meal)));
            i++;
        }
    }
    public Meal getMealByID(Integer id){
        return meals.get(id-1);
    }
    public void changeAvailability(Integer id){
        meals.get(id - 1).changeAvailability();
    }
    private String outAvailability(Meal meal){
        return (meal.isAvailable() ? "Доступно" : "Не доступно");
    }
}
