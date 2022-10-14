package lab2;

public class Main {
    public static void main(String[] args) {

        Actor [] tablou = new Actor[5];
        creare(tablou);
        afisare(tablou);

    }
    static void creare(Actor[] tablou)
    {
        tablou[0]= new Actor("Ionescu","Ion",1999,"Paris");
        tablou[1]= new Actor("Popescu","Ioana",1990,"Timisoara");
        tablou[2]= new Actor("Pop","Marius",2000,"Arad");
        tablou[3]= new Actor("Sorescu","Horea",1992,"Madris");
        tablou[4]= new Actor("Miorescu","Preda",1995,"Cluj");
    }
    static void afisare(Actor[] tablou)
    {
        for(Actor a:tablou)
            System.out.println(a);
    }
    static void numarare (Actor[] tablou)
    {
        int counter=0;
        for (Actor e: tablou)
            if(e.getScoala().equals("Fara Scoala"))
                counter++;
        System.out.println(counter);
    }
    static void nume(Actor [] tablou, String Val)
    {
        for(Actor e: tablou)
            if(e.getNume().startsWith(Val)|| e.getNume().equals(Val))
                System.out.println(e.getNume());
    }
}