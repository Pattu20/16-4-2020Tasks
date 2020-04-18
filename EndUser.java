interface NotePad
{
  void runsOn();
}

class WinOS implements NotePad{
public void runsOn(){
System.out.println("runsOn winOs");
}
}
class MacOS implements NotePad{
public void runsOn(){
System.out.println("runsOn MacOs");
}
}
class EndUser 
{ 
public static void main(String args[]){
NotePad np = new WinOS();
np.runsOn();
np = new MacOS();
np.runsOn();
}
}