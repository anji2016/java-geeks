# java-geeks
To learn basics of java 

Main components of java:
	 1. class  - A  class consists of variables and methods
	 2. variable - It is used to store and access data  ( state) 
	 3. method - to implement functionality(logic or behavior ) 
	 4. interface ( its like class but with some special features)
	 
	 
Access Modifiers:
 default , private , protected , public
 
Terminology:
; - semicolon 
{} - flower or curly braces
() - parenthesis
"" - double quotes
'' - single quotes 
<> - angular brackets

Assignment 1:

Write a class (name it as Person)  which includes variables ( name , gender , age , salary , address ) and also methods which return these variables ( getName , getGender , getAge , getSalary , getAddress)

Types : 
   1 .Primitive data types - int , float , decimal , long , double , short 
   2. Class - String , Bank etc
   
Wrapper classes:
  wrapper --> primitive 
  Integer --> int
  Float ---> float
  Decimal ---> decimal
  Long   --- > long
  Short ---> short

Generics:
why Generics ? It ensures type safety
List , Set , Map (Collection of objects) --> Basket 
Data Type (Class type not at all of primitive ) --> Fruit
create a list for Strings --> List<String> , List<Bank> , List<Integer>, Set<Float>, Set<Long> 

Interface:
It has methods which are defined.
A class which implements interface should implement all defined methods

Assignment 2:

1. Write a class (name it as Bank)  which includes variables ( bankName , facilities , address ) and also methods which return these variables ( getBankName , getFacilities , getAddress)

2. Write an interface ( name it as Flower ) which includes defined methods like (  getName , getColor , getFragrance , getNoOfSepals )

3. Write a notes on Variables , Class , method , Generics , access modifiers and interface in java

Do Small Research: 
JDK version .. current JDK version 14 , 15 in progress
my project includes JDK 8
reference : https://howtodoinjava.com/java-version-wise-features-history/

Backward compatibility: Can old code works in new version ? If answer is Yes then its backward compatible
   reference : https://whatis.techtarget.com/definition/backward-compatible-backward-compatibility
               https://en.wikipedia.org/wiki/Backward_compatibility
   Java - yes
   python - no
   
Interfaces : before JDK8 doesn't have implementation . Only definition is allowed 
             after JDK8 implementation is also allowed.
             




