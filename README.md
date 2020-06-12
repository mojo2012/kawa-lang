# kawa-lang
kawa programming language

Toy project to implement a better programming language than java ;-)

## Features
### Consistent syntax for ...
variable declaration:
```
var numberOfUsers: Integer // uninitialized variable
var currentUsername: String? = null // initialized with null
var lastUsername = "teststring" // type is inferred
val numberOfLogins = 1 // final declaration, type is inferred
```
> **Variables and class fields align properly** unlike java, where the types are in front of the variable name.

Class-level fields:
```
class Test {
    @prop //implicit protected + getter for "val" or getter/setter for "var"
    var fullName: char[] = "test"
}
```
> Getters/setters are generated automatically, but can be manuelly implemented as well

method decaration:
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

Methods as first-class citizens:
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

* Control statements are expressions (val name = 

# Development setup

Install
* vscode
* https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4
* https://marketplace.visualstudio.com/items?itemName=redhat.java

The grammar is in `src/main/java/io/spotnext/kawa/Kawa.g4`. The java classes will be refreshed by the antlr plugin. Then you can launch the Debug launch config.
