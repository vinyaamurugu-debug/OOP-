public class Storebill{
public static void main(String []args){
int itemA=2*200;
int itemB=1*75;
int itemC=3*500;
double Total=itemA+itemB+itemC;
double Afterdiscount=Total-(0.1*Total);
double Aftertax=Afterdiscount+(0.05*Afterdiscount);
System.out.println("The Final Price is:"+Aftertax);




}
}