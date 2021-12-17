import 'dart:io'; //io package allows for input output
import 'dart:async'; //async allows for synchronous and asynchronus operations
                     //async operations are things that can be done at same time
                     /*lot of io in dart is async which causes problem because
                     we are working synchronously, we want things to happen in certain order
                      */
void main(List<String> arguments) {

  stdout.write('What is your name\r\n'); // here \r and \n are escape sequences

  String name = stdin.readLineSync();
  print(name);
  //readlinesync-> will read input from user synchronously
  //it will block our program from executing untill that function is completed
}
