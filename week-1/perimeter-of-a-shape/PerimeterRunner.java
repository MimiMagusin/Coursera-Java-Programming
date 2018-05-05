import edu.duke.*;

public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }
    
    public int getNumPoints (Shape s) {
        
        int counter = 0;
        Iterable<Point> shapeIterable = s.getPoints();
        
        for (Point Mimus : shapeIterable) {
            counter++;
        }

        return counter;
    }
    
    public double getAverageLength (Shape s) {
        
        double perimeter = getPerimeter(s);
        return (perimeter / getNumPoints(s));
    }
    
    public double getLargestSide (Shape s) {
        double longestSide = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            if(currDist > longestSide) {
                longestSide = currDist;
            }
            prevPt = currPt;
        }
        return longestSide;
    }
    
    public double getLargestX (Shape s) {
        Iterable<Point> allPoints = s.getPoints();
        int max = 0;
        for (Point JP : allPoints) {
            if (JP.getX() > max) {
                max = JP.getX();
            }
        }
        return max;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource("example2.txt");
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        int numPoints = getNumPoints (s);
        System.out.println("Number of points: " + numPoints);
        double averageLength = getAverageLength(s);
        System.out.println("Average length: " + averageLength);
        double largestSide = getLargestSide (s);
        System.out.println("LargestSide: " + largestSide);
        double largestX = getLargestX (s);
        System.out.println("Largest X: " + largestX);
    }

    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
