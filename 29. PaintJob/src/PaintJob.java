public class PaintJob {
    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        //constraint
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            return (int) Math.ceil((area/areaPerBucket) - extraBuckets);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        //constraint
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            return (int) Math.ceil((area/areaPerBucket));
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        //constraint
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil((area/areaPerBucket));
        }
    }
}
