```groovy
def myMethod(Closure closure) {
  closure() // This line can cause unexpected behavior
}

myMethod { 
  println "Hello" 
  throw new RuntimeException("Something went wrong")
}
```