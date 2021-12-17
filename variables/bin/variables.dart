import 'dart:convert';

late String name; //this is a late variable

/* If you fail to initialize a late variable
,a runtime error occurs when the variable is used.
 */

/*If you’re sure that a variable is set before it’s used,
but Dart disagrees, you can fix the error by marking the variable as late:
 */

void main()
{
  name="Suraj";
  print(name);

  num numbers; //num can take both int and double values
  numbers = 12.9;
  numbers += 12;
  print(numbers);

  int integer;
  integer =10;
  print(integer);

  double thisisdecimal;
  thisisdecimal = .9999;
  print(thisisdecimal);

  //converting variables from one type to another

  //string->int
  var one = int.parse('21');
  assert(one==21);
  print(one);

  //string->double
  var onedotone =double.parse('69.420');
  //assert(onedotone=='69.420');
  //will return false as 69.420 has been parsed to double type
  print(onedotone);

  //int->string
  String oneasString = 1.toString();
  assert(oneasString=='1');
  //will return true as 1 has been converted to string type
  print(oneasString);

  //double->String
  String sixnine_asString = 69.694218.toStringAsFixed(3);
  assert(sixnine_asString=='69.694');
  print(sixnine_asString);
}