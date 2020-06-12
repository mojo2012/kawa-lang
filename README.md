# kawa-lang
kawa programming language

Toy project to implement a better programming language for the JVM ;-)

## Features
### Null-safe navigator
```
var name = generator?.generateName()
```
> If object is null there will be no exception thrown, instead the name variable will be set to null

### Builders syntax
```
val person = Person
    .new(name = "Peter") // named arguments
    ..age = 20
    ..surName = "Pan"
```
> The `..` operator returns the current instance and therefore allowed to use a builder-like syntax

### Variable declaration
```
var numberOfUsers: Integer // uninitialized variable
var currentUsername: String? = null // initialized with null
var lastUsername = "teststring" // type is inferred
val numberOfLogins = 1 // final declaration, type is inferred
```
> **Variables and class fields align properly** unlike java, where the types are in front of the variable name.

### Class-level fields
```
class Test {
    @prop //implicit protected + getter for "val" or getter/setter for "var"
    var fullName: char[] = "test"
}
```
> Getters/setters are generated automatically, but can be manuelly implemented as well

### Method decaration
```
@private @abstract
def doStuff = (): void

@public @async
def syncStuff = (): String { }

@async
def returnStuff = (): Byte[] { }

@static @synchronized
def getStuff = (value: Integer?, name = "name", money = 2.2 as BigDecimal): int { }

def calculate = (value: int): void {
	//
}

@abstract
def abstractMethod = (value: int): String
```
> Methods also **align properly** - same as fields on the class level.
> Method parameters can defined **default values**.
> Modifiers are modelled as (lower-case) annotations
> The **default visibility modifier for classes and methods is public**, for fields it is **protected**.

### Methods as first-class citizens
```
class Test {
    def calculate = (): int {
        //
    }

    // further down in the code ...
    
    def main = (args: String[]) {
        val calcMethod = this::calculate // method bound to a specific instante
        calcMethod()
        
        val calcMethod2 = Test::calculate // unbound to a specific instance
        calcMethod2(this) // to invoke the mothod an instance of the owning class must be passed as first argument
    }
}

val notNullCheck = (input): void { assert input not null : "Input was null" }
notNullCheck(null) // with throw an AssertionException
```
> Closures can be defined an called like regular methods using (<params>)

### Control statements are expressions and can yield results
```
val result = if (name isnot null) {
    yield "gotit"
} else {
    yield "empty"
}
```
> The yield keyword can be used to the return values within any control construct like loops or if or switch.

### Map and list comprehension
Creation and usage of maps is greatly simplified compared to java (much like in groovy):
```
val emptyMap = {}
val map = { "getTestString": ():String { return "test"}), "key2": "value2" }
map?["getTestString"]() // nullsave access and execution of closures
map["key2"] = "new value"
map["key3"] = "new value" // add a new key
```
> Maps can also hold closures which can be invoked using method call syntax

```
val emptyArray: String[] = [] // type has to be defined as it cannot be inferred
val value1 = emptyArray?[1] // value1 is null, no exception is thrown
val array = [ "Peter", "Susan" ]
```

# Summary
Overall kawa tries to be as consistent as possible when it comes to syntax. As this is a work in progress, things might change overtime :-)
Feedback is very welcome!

Currently I'm evaluating using the GraalVM and Truffle framework to implement the kawa. The benefits would be to automatically have access to a generated debugger and code infrastructure tools (like a language-server and syntax highlighting). Imho, every good programming languages needs a proper IDE support!

# Development setup

Install
* vscode
* https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4
* https://marketplace.visualstudio.com/items?itemName=redhat.java

The grammar is in `src/main/java/io/spotnext/kawa/Kawa.g4`. The java classes will be refreshed by the antlr plugin. Then you can launch the Debug launch config.


