import 'dart:collection';
enum colors {red,green,blue}

void main()
{
  print(colors.values);
  print(colors.red);

  var test = [1,2,3,4];
  print(test.length);
  print("this is it ${test[0]}");

  print(test.elementAt(3));

  //var things = new List();
  //things.add(1);

  //SETS
  //sets are lists which cant contain duplicates
  Set<int> numbers = new Set<int>();
  numbers.add(1);
  numbers.add(2);
  numbers.add(3);
  numbers.add(1); //this will not be added
  print(numbers);

  //queues
  //queues are ordered, no index add & remove from start & end

  Queue items = new Queue ();
  items.add(1);
  items.add(3);
  items.add(5);
  items.removeFirst();
  items.removeLast();
  print(items);

  //MAPS
  //key value pair

  Map people = {'dad':'ram','son':'suraj','mom':'lata','brother':'akash'};
  print(people);
  print("keys are ${people.keys}");
  print("values are ${people.values}");
  print("Brother is ${people['brother']}");
  print("Mom is ${people['mom']}");

  //specifying data type that can be held in map
  Map<String,int> friends = new Map<String,int>();
  friends={'shrey':1,'gautam':2,'me':3};
  print("shreys number is ${friends['shrey']}");

  //a map contains two lists. A list of keys & a list of values but
  // what a map really does is to bridge those two lists
  // so you can call a value based on its key
}
