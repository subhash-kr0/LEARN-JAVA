// Access Modifiers in Java

public class Tut54 {
    //public package only Accessable if it another packges
    //same folder packages Accessable even if they are not say public
    //private variable only Accessable only same class
    //if variable not say public and private then it is called Default which is Accessable in smae package

    //if declayer Protected then it is not Accable another package but it work in same package and also subclass Accessable

                                               //Private          Protected           Public           Default
    
     //Same class                                 yes              yes                 yes              yes
     //Same Package, subclass                      No              yes                 yes              yes
     //Same package ,Non-Subclass                  No              yes                 yes              yes
     //Different Package, subclass                 No              yes                 yes              No
     //Different Package , Non-subclass            No              No                  yes              No
} 
