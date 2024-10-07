package com.bptn.course._17_polymorphism;

//This class needs to extend the Greeter Class
class SpanishGreeter extends Greeter {

 // Overriding the greet() method
 @Override
 public String greet() {
     return "Hola!";
 }
}