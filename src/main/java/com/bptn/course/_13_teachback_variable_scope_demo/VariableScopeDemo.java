package com.bptn.course._13_teachback_variable_scope_demo;

public class VariableScopeDemo {
    //1.  Instance variable (class scope)
    private String instanceVariable = "I am Accessible.";
    
  
    
    public void localScopeExample() {
        //2. Local variable (local scope)
        int localVariable = 10;
        System.out.println("Inside localScopeExample:");
        System.out.println("Local Variable: " + localVariable);
        //System.out.println("Instance Variable: " + instanceVariable);
        //System.out.println("Static Variable: " + staticVariable);
    }
    
    public void anotherMethod() {
        System.out.println("Inside anotherMethod:");
        // Cannot access localVariable here, will cause an error
        //System.out.println("local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        //System.out.println("Static Variable: " + staticVariable);
    }
    
    public static void main(String[] args) {
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.localScopeExample();
       // demo.anotherMethod();
    }
}

