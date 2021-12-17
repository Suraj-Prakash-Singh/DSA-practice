void main()
{
  //assert

  print("Start");
  int num = 45;
  assert(num==45);
  print("End");
  //assert(num>50);  will throw error
  //what assert does is it actually determines if something is true

  //THE IF-ELSE
  int age = 21;
  if(age==18) print("you are 18 years old");
  if(age!=18) print ("you are not 18 years old");

  if(age>18){
    print("you are adult now");
    if(age>20) print("you are in your early twenties");
  }
  if(age<18){
    print("you are not adult yet");
    if(age<13) print("Not even a teenager");
  }
  if(age==21){
    print("this is your special year");
  }else
    print("this is just a normal year");
}