import java.util.Scanner;

public class Pizza {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        AmericanPizza americanPizza=new AmericanPizza("American pizza", 150);
        MargaritPizza margaritPizza=new MargaritPizza("Margarit pizza", 110);
        NeapolitanPizza neapolitanPizza=new NeapolitanPizza("Neapolitan pizza", 145);
        Cheese cheese=new Cheese("cheese",25);
        Sausage sausage=new Sausage("sausage",12);
        Olives olives=new Olives("olives", 7);
        Pineapple pineapple=new Pineapple("pineapple", 10);
        System.out.println("menu:\n Pizza:\n 01.American pizza - "+ americanPizza.getPriceAmerican()+"\n 02.Margarit pizza - "
                +margaritPizza.getPriceMargarit()+"\n 03.Neapolitan pizza - "+ neapolitanPizza.getPriceNeapolitan()+
                "\n 04.cheese - "+ cheese.getPriceCheese()+"\n"+" 05.sausage - "+sausage.getPriceSausage()+"\n"+
                " 06.olives - "+olives.getPriceOlives() + "\n 07.pineapple - "+pineapple.getPricePineapple());
        int Sum=0;
        int i=0;
        while (i<100) {
            System.out.println("Enter the selected ingredient or input <100>:");
            String numberIngredient=scanner.nextLine();
            int numberInt=Integer.parseInt(numberIngredient);
            switch(numberInt) {
                case 1:
                    System.out.println("How many pizzas will you have?");
                    String numberAmerican=scanner.nextLine();
                    int numberAmericanInt=Integer.parseInt(numberAmerican);
                    Sum=Sum+ numberAmericanInt*americanPizza.getPriceAmerican();
                    System.out.println( "Our pizza costs "+ Sum+" UAH");
                    break;
                case 2:
                    System.out.println("How many pizzas will you have?");
                    String numberMargarit=scanner.nextLine();
                    int numberMargaritInt=Integer.parseInt(numberMargarit);
                    Sum=Sum+ numberMargaritInt*margaritPizza.getPriceMargarit();
                    System.out.println( "Our pizza costs "+ Sum+" UAH");
                    break;
                case 3:
                    System.out.println("How many pizzas will you have?");
                    String numberNeapolitan=scanner.nextLine();
                    int numberNeapolitanitInt=Integer.parseInt(numberNeapolitan);
                    Sum=Sum+ numberNeapolitanitInt*neapolitanPizza.getPriceNeapolitan();
                    System.out.println( "Our pizza costs "+ Sum+" UAH");
                    break;
                case 4:
                    Sum=Sum+ cheese.getPriceCheese();
                    System.out.println("Cheese costs "+ cheese.getPriceCheese()+" UAH");
                    System.out.println("Our pizza costs "+ Sum+" UAH");
                    break;

                case 5:
                    Sum=Sum+ sausage.getPriceSausage();
                    System.out.println("Sausage costs"+sausage.getPriceSausage()+" UAH");
                    System.out.println("Our pizza costs "+ Sum+" UAH");
                    break;
                case 6:
                    Sum=Sum+ olives.getPriceOlives();
                    System.out.println("Olives costs "+olives.getPriceOlives()+" UAH");
                    System.out.println("Our pizza costs "+ Sum+" UAH");
                    break;
                case 7:
                    Sum=Sum+ pineapple.getPricePineapple();
                    System.out.println("Olives costs "+pineapple.getPricePineapple()+" UAH");
                    System.out.println("Our pizza costs "+ Sum+" UAH");
                    break;
                case 100:
                     i=100;
                    System.out.println("Our pizza costs "+ Sum+" UAH"+"\n"+"Bon appetite!");
                    break;
                default:
                    System.out.println("There is no such ingredient. Retype.");
            }
        }

    }
}
class NeapolitanPizza{
    private int priceNeapolitan;
    private String nameNeapolitan;

    public NeapolitanPizza(String nameNeapolitan, int priceNeapolitan) {
        this.nameNeapolitan = nameNeapolitan;
        this.priceNeapolitan = priceNeapolitan;
    }

    public int getPriceNeapolitan() {
        return priceNeapolitan;
    }
}
class AmericanPizza{
    private int priceAmerican;
    private String nameAmerican;

    public AmericanPizza(String nameAmerican, int priceAmerican) {
        this.nameAmerican = nameAmerican;
        this.priceAmerican = priceAmerican;
    }

    public int getPriceAmerican() {
        return priceAmerican;
    }
}
class MargaritPizza{
    private int priceMargarit;
    private String nameMargarit;

    public MargaritPizza(String nameMargarit, int priceMargarit) {
        this.nameMargarit = nameMargarit;
        this.priceMargarit = priceMargarit;
    }

    public int getPriceMargarit() {
        return priceMargarit;
    }
}
class Cheese {
    private int priceCheese;
    private String nameCheese;

    public Cheese(String name, int price) {
        nameCheese = name;
        priceCheese = price;
    }

    public int getPriceCheese() {
        return priceCheese;
    }
}
class Sausage{
   private int priceSausage;
   private String nameSausage;
   public Sausage(String nameSausage, int priceSausage){
       this.nameSausage=nameSausage;
       this.priceSausage=priceSausage;
   }

    public int getPriceSausage() {
        return priceSausage;
    }
}
class Olives{
   private int priceOlives;
   private String nameOlives;
   public Olives(String nameOlives, int priceOlives){
       this.nameOlives=nameOlives;
       this.priceOlives=priceOlives;
   }

    public int getPriceOlives() {
        return priceOlives;
    }
}
class Pineapple {
    private int pricePineapple;
    private String namePineapple;
    public Pineapple(String namePineapple, int pricePineapple){
        this.namePineapple =namePineapple;
        this.pricePineapple =pricePineapple;
    }

    public int getPricePineapple() {
        return pricePineapple;
    }
}
