package com.bvan.oop.lesson9.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> words = langs();

        Map<String, Integer> wordToCount = countWords(words);
        List<Map.Entry<String, Integer>> pairs = sortByCount(wordToCount);

        for (Map.Entry<String, Integer> pair : pairs) {
            System.out.println(pair);
        }
    }

    private static List<String> langs() {
        return Arrays.asList(
                "Java",
                "C#",
                "Kotlin",
                "C#",
                "Java",
                "Java",
                "Kotlin",
                "JavaScript",
                "Kotlin",
                "C#",
                "C#",
                "C++",
                "Java",
                "JavaScript",
                "C#",
                "JavaScript"
        );
    }

    private static List<Map.Entry<String, Integer>> sortByCount(Map<String, Integer> wordToCount) {
        List<Map.Entry<String, Integer>> pairs =
                new ArrayList<>(wordToCount.entrySet());

        Comparator<Map.Entry<String, Integer>> c = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        };
        pairs.sort(c.reversed());
        return pairs;
    }

    private static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordToCount = new TreeMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }
        return wordToCount;
    }

    private static List<String> sampleWords() {
        String text = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. As of 2016, Java is one of the most popular programming languages in use,[18][19][20][21] particularly for client-server web applications, with a reported 9 million developers.[22] Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.\n" +
                "\n" +
                "The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun relicensed most of its Java technologies under the GNU General Public License. Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).\n" +
                "\n" +
                "The latest version is Java 9, released on September 21, 2017,[23] and is one of the two versions currently supported for free by Oracle. Versions earlier than Java 8 are supported by companies on a commercial basis; e.g. by Oracle back to Java 6 as of October 2017 (while they still \"highly recommend that you uninstall\"[citation needed] pre-Java 8 from at least Windows computers).";

        String clearText = text.replace("\n", "")
                .replace(",", "")
                .replace(".", " ")
                .replace("(", "")
                .replace(")", "");

        return Arrays.asList(clearText.split(" "));
    }
}
