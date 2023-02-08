class Task2{
public static void main(String args[]){
Task1 t1 = new Task1();
t1.perform();
}
void perform(){
int a =10,b = 20, c= 30;

if(a>b && a>c){
System.out.println(a+" is Maximum");
}
else if(b>a && b>c){
System.out.println(b+" is Maximum");
}
else{
System.out.println(c+" is Maximum");
}

}

