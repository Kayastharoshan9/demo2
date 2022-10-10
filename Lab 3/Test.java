public class Test {
    public static void main(String[]args) {
        Holiday ho = new Holiday();
        h.setName("Constitution Day");
        h.setDay(5);
        h.setMonth("March");
        h.setHoliday(false);
        
        String n,m;
        int d;
        boolean h;
        n= h.getName();
        d=h.getDay();
        m=h.getMonth();
        ho=h.isHoliday();
        System.out.println(n+""+ m+ d+ h);
        }
        
        
        }

