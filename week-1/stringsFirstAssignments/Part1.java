
/**
 * class Part1 - Find the index position of start codon, end codon with a
 * substring with a length that is a multiple of three
 *
 * @author Mimi Magusin
 * @version May 2018
 */
public class Part1 {
    
    public String findSimpleGene(String dna){
        String startCodon = "ATG";
        String endCodon = "TAA";
        int codonLength = 3;
        
        int indexOfStartCodon = dna.indexOf(startCodon);
        if (indexOfStartCodon == -1) {
            return "No start codon";
        }
        
        int indexOfEndCodon = dna.indexOf(endCodon, (indexOfStartCodon + codonLength));
        if (indexOfEndCodon == -1) {
            return "No end codon";
        }
        
        boolean substringDividableByThree = (indexOfEndCodon - indexOfStartCodon)%3 == 0;
        if(substringDividableByThree){
            return dna.substring(indexOfStartCodon, indexOfEndCodon + codonLength);
        }
        return "Not a valid DNA string"; 
    }
    
    public void testSimpleGene(){
        /* Write the void method testSimpleGene that has no parameters. You should 
         * create five DNA strings. The strings should have specific test cases, such 
         * as: DNA with no “ATG”, DNA with no “TAA”, DNA with no “ATG” or “TAA”, DNA 
         * with ATG, TAA and the substring between them is a multiple of 3 (a gene), 
         * and DNA with ATG, TAA and the substring between them is not a multiple of 3.*/
         
         String validDNA = "ATGAAATAA";
         String gene = findSimpleGene(validDNA);
         System.out.println("ValidDNA " + validDNA);
         System.out.println("Gene: " + gene);
         
         String noATG = "GTAAATTAA";
         String noStartCodon = findSimpleGene(noATG);
         System.out.println("noStartCodon " + noATG);
         System.out.println("Gene: " + noStartCodon);
         
         String noTAA = "ATGAATGTA";
         String noEndCodon = findSimpleGene(noTAA);
         System.out.println("noEndCodon " + noTAA);
         System.out.println("Gene: " + noEndCodon);
         
         String noFullCodons = "ATGGTAATAA";
         String invalidDNA = findSimpleGene(noFullCodons);
         System.out.println("noFullCodons" + noFullCodons);
         System.out.println("Gene: " + invalidDNA);
    }

}
