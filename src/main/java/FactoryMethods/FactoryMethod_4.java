package FactoryMethods;

import com.sun.tools.javac.util.List;
import jdk.internal.org.jline.terminal.spi.TerminalProvider;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.stream.Stream;

public class FactoryMethod_4 {
    public static void main(String[] args) {
        Calendar.getInstance();
        NumberFormat.getInstance();
        List.of(1,2,3,4);
        Integer valueOf = Integer.valueOf("1234");
    }
}
