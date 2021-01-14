public class Shot {
    
    public void shooting(){
        int i = (int)(Math.random()*2 + 1);
        if (i == 1){
            System.out.println("You have made the shot!");
        }else{
            System.out.println("You missed.");
        }

    }
}
