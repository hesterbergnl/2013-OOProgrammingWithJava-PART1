/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class StringUtils {
    public StringUtils() {
    
    }
    
    public static boolean included(String word, String searched){
        String wordStandard;
        String searchedStandard;
        
        wordStandard = word.trim().toUpperCase();
        searchedStandard = searched.trim().toUpperCase();
        
        if(wordStandard.isEmpty() || searchedStandard.isEmpty()){
            return false;
        }
        else{
            if(wordStandard.contains(searchedStandard)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
