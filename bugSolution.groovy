```groovy
def myMethod(Closure closure) {
  try {
    closure() 
  } catch (RuntimeException e) {
    println "Error in closure: ${e.message}"
    // Handle the exception appropriately
  }
}

myMethod { 
  println "Hello" 
  throw new RuntimeException("Something went wrong")
}
```