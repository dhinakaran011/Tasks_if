class Task10{
public static void main(String args[]){
Task10 t10 = new Task10();
t10.perform();
}
void perform(){
int n = 15;
if(n%2 == 1){
            System.out.println("Weird");
        }
        else{
            if((n>=2 && n<=5) || (n>20)){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
        }
}
}

