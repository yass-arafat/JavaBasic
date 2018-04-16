/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaAdvancedBasic.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author yassir
 */
public class OptionalBasic {

    public static void main(String[] args) {
        emptyOptinalObject();

        optionalOfBasic();

        optionalIfPresent();

        optionalOrElseBasic();

        // if found any iteresting about orElseGet() add it here then

        optionalWithGenericTypeAndLamdaExpressions();

        optinalOfNullableBasic();

        optionalMapBasic();

        optionalFilterBasic();

        optionalFlatMapBasic();

        Optional.<String>ofNullable(null)
                .flatMap(x -> x != null ? Optional.of("A") : Optional.of("B"))
                .map(String::toLowerCase)
                .ifPresent(System.out::println);
        // hint : run this :D
        // System.out.println(""+Optional.<String>ofNullable(null));
    }
    
    private static void emptyOptinalObject() {
        Optional<String> emptyOptionalOb = Optional.empty();
        System.out.println("Empty Object = "+emptyOptionalOb.isPresent());//The isPresent API is used to check if there is a value inside the Optional object
    }
    
    private static void optionalOfBasic() {
        Optional optionalOfObject = Optional.of("Yassir");// the argument passed to the 'of' method cannot be null, otherwise, we will get a NullPointerException:
        System.out.println("Name is = "+optionalOfObject.toString());
        
        // java.lang.NullPointerException
        /** System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));**/
    }
    
    /**
     * by if present checking we can reduce much line of boilerplate code with the help of
     * functional programming style.
     * also Optional makes one deal with nullable values explicitly as a way of enforcing good programming practice.
     */
    private static void optionalIfPresent() {
        Optional<String> optionalOb = Optional.of("Yassir");
        optionalOb.ifPresent(name -> {System.out.println("Name = "+name);});
    }
    
    /**
     * with orElse you can set some value if coming value is null or you want to change it
     */
    private static void optionalOrElseBasic() {
        
        System.out.println("name remains = "+Optional.ofNullable("Yassir").orElse("Arafat"));
        System.out.println("name changed = "+Optional.ofNullable(null).orElse("Arafat"));
    }

    private static void optionalWithGenericTypeAndLamdaExpressions() {
        // TYPE 1: Without Generic
        Optional opUserAccountWithoutGeneric = Optional.of(new UserAccount());
        // in this case optional will return object which we need to cast
        opUserAccountWithoutGeneric.ifPresent((t) -> {System.out.println("" + ((UserAccount) t).doSomething());});// using lamda's
        // In this case method reference will not work cause it can't understand which object's method it is
        // as no generic type defined
        /**opUserAccountWithoutGeneric.ifPresent(UserAccount::doSomething);**/// using method reference

        // TYPE 2: With Generic 
        Optional<UserAccount> opUserAccount = Optional.of(new UserAccount());
        // in this case we don't need to cast
        opUserAccount.ifPresent((t) -> {System.out.println("" + t.doSomething());});// using lamda's
        opUserAccount.ifPresent(UserAccount::doSomething);// using method reference
    }

    /**
     * You can't set null value in Optional.of()
     * but you can set null vlue in Optional.ofNullable()
     */
    private static void optinalOfNullableBasic() {
        String answer1 = "Yes";
        String answer2 = null;
        System.out.println("" + Optional.ofNullable(answer1));
        
        // we cn pass null value in ofNullable method. In this case it will return empty optional
        // rather then Null Pointer Exception
        System.out.println("" + Optional.ofNullable(answer2));
    }
    
    /**
     * the map API takes the existing value, performs a computation using this value and 
     * returns the result of the computation wrapped in an Optional object: 
     */
    private static void optionalMapBasic() {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();
        
        // optional.map here mapping the value of obj "male" temporarily and executing the method toUppercase 
        // "MALE" 
        System.out.println("Non-Empty Optional:: "+nonEmptyGender.map((t) -> {
            return t.toUpperCase();
        }));
        // object's main value won't affected for operation during in lamda's
        System.out.println(""+nonEmptyGender);
        
        // for empty object value nothing will map or creates exception. will return empty result
        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));
    }
    
    /**
     * While using map API, therefore, we need to add an extra call to retrieve the value before using the transformed value
     * This operation is performed implicitly when using flatMap.
     */
    private static void optionalFlatMapBasic() {
        
        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOptionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOptionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
        
        Optional<Optional<Optional<String>>> nonEmptyOptionalGenderAgain = Optional.of(Optional.of(Optional.of("male")));
        
        // this 2 process below won't work
        /* 
        System.out.println("Optional.map     :: " + nonEmptyOptionalGenderAgain.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOptionalGenderAgain.flatMap(gender -> gender.map(String::toUpperCase)));
         */
        
        // this 2 will work
        System.out.println("Optional.map     :: " + nonEmptyOptionalGenderAgain.map(
                gender -> gender.map(
                        gen -> gen.map(String::toUpperCase))));

        System.out.println("Optional.flatMap :: " + nonEmptyOptionalGenderAgain.flatMap(
                gender -> gender.map(
                        gen -> gen.map(String::toUpperCase))));
        
    }

    private static void optionalFilterBasic() {
        boolean isInrange = withoutFilter(new Modem());
        isInrange = withFilter(new Modem());
    }

    private static  boolean withoutFilter(Modem modem) {
        boolean isInRange = false;

        if (modem != null && modem.getPrice() != null
                && (modem.getPrice() >= 10
                && modem.getPrice() <= 15)) {

            isInRange = true;
        }
        return isInRange;
    }

    private static boolean withFilter(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <= 15)
                .isPresent();
    }

    public static class Modem {

        private Double price;

        public Modem(Double price) {
            this.price = price;
        }

        private Modem() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
        
        
    }
}





