# HorusTest
Test solution

To resolve this test and implement Optional<Block> findBlockByColor(String color), List<Block> findBlocksByMaterial(String material),
int count() methods from interface Structure first I had to notice that is the template of the composite design pattern.
  
After that the code became more readable for me and gave me more flexibility so I could start the work with the methods implementation.
In this case I know two different solutions for the Optional<Block> findBlockByColor(String color) and
List<Block> findBlocksByMaterial(String material).
  
  1. I could use the for loop and iterate through all elements inside the list and if some element would equals the word I provide as
  an argument the method could return found block and very similar on the second method.
  
  2. In my solution I used the tool that is available from Java 8 and called stream().filter(). For me is the best solution for this 
  problem so I finally decided to use this.
 
For the testing purpose I created ClayBlock, ConcreteBlock and CeramicBlock that extends the ParentBlock. Everything is tested using 
JUnit5. To see that everything works correctly please run Wall_Test or implement your own code in Main 
  
