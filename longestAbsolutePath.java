import java.util.HashMap;
import java.util.Map;

public class longestAbsolutePath {
	    public int findLongestPath(String input){
	        Map<Integer, String> levels = new HashMap<>();
	        int firstIndex = 0, lastIndex = 1, strLength = input.length(), maxLength, levelCount = 0, currentLevelCount;

	        String maxPath, levelStr, filePath;

	        while (input.charAt(lastIndex) != '\n' && lastIndex < strLength){
	            lastIndex++;
	        }

	        levels.put(levelCount, input.substring(firstIndex, lastIndex));

	        maxLength = 0;
	        maxPath = "";

	        while(lastIndex < strLength){
	            lastIndex++;

	            currentLevelCount = 0;

	            while (input.charAt(lastIndex) == ' '){
	                currentLevelCount++;
	                lastIndex++;
	            }

	            firstIndex = lastIndex;

	            while (lastIndex < strLength && input.charAt(lastIndex) != '\n' ){
	                lastIndex++;
	            }

	            levelStr = input.substring(firstIndex, lastIndex);

	            if(isFileName(levelStr)){
	                filePath = "";

	                for(int i = 0; i < currentLevelCount; i++)
	                    filePath += levels.get(i) + "/";

	                filePath += levelStr;

	                if(filePath.length() > maxLength){
	                    maxLength = filePath.length();
	                    maxPath = filePath;
	                }
	            }
	            else {
	                levelCount = currentLevelCount;
	                levels.put(levelCount, levelStr);
	            }
	        }
	        return maxPath.length();
	    }

	    public boolean isFileName(String input){

	        for(int i = 0; i < input.length(); i++)
	            if(input.charAt(i) == '.') {
	            	if(input.contains("jpeg") || input.contains("gif") || input.contains("png")){
	            		return true;
	            	}
	            }

	        return false;
	    }
	    public static void main(String[] args) {
		longestAbsolutePath lap = new longestAbsolutePath();
		String s = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		System.out.println(lap.findLongestPath(s));
		
	    }

}
