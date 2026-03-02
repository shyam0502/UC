public class BannerApp {
    public static void main(String[] args) {
        // Create a String array to store all banner lines
        String[] bannerLines = new String[7];
        
        // Populate the array with banner patterns using String.join()
        bannerLines[0] = String.join("", 
            "██████╗ ", "██████╗ ", "██████╗ ");
        bannerLines[1] = String.join("", 
            "██╔══██╗", "██╔══██╗", "██╔══██╗");
        bannerLines[2] = String.join("", 
            "██████╔╝", "██████╔╝", "██████╔╝");
        bannerLines[3] = String.join("", 
            "██╔═══╝ ", "██╔═══╝ ", "██╔═══╝ ");
        bannerLines[4] = String.join("", 
            "██║     ", "██║     ", "██║     ");
        bannerLines[5] = String.join("", 
            "╚═╝     ", "╚═╝     ", "╚═╝     ");
        bannerLines[6] = String.join("", 
            "        ", "        ", "OPS");
        
        // Print banner using enhanced for-loop
        System.out.println("OPS Banner Application - UC4");
        System.out.println("============================\n");
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
        
        // Alternative approach using traditional for-loop
        // System.out.println("\nUsing traditional for-loop:");
        // for (int i = 0; i < bannerLines.length; i++) {
        //     System.out.println(bannerLines[i]);
        // }
    }
}