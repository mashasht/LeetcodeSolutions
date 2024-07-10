import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SubstringWithConcatenation;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringWithConcatenationTest {
    SubstringWithConcatenation substringWithConcatenation;

    @BeforeEach
    void setUp(){
        substringWithConcatenation = new SubstringWithConcatenation();
    }

    @Test
    void findSubstring_foo_bar(){
        assertEquals(List.of(0, 9), substringWithConcatenation.findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
    }

    @Test
    void findSubstring_word_good_best(){
        assertEquals(List.of(), substringWithConcatenation.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
    }

    @Test
    void findSubstring_bar_foo_the(){
        assertEquals(List.of(6,9,12), substringWithConcatenation.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
    }

    @Test
    void findSubstring_word_good_best_good(){
        assertEquals(List.of(8), substringWithConcatenation.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}));
    }

    @Test
    void findSubstring_ding_wing(){
        assertEquals(List.of(13), substringWithConcatenation.findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo","barr","wing","ding","wing"}));
    }

    @Test
    void findSubstring_aa(){
        assertEquals(List.of(0,1,2,3,4,5,6,7,8,9,10), substringWithConcatenation.findSubstring("aaaaaaaaaaaaaa", new String[]{"aa","aa"}));
    }
}
