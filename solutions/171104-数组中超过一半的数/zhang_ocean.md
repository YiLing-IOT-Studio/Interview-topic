```java
public class TestArray {

    public static void main(String[] args) {

        int array[] = {1,2,3,2,2,2,5,4,2};
        int count=0;
        int maxCount=-1;
        int index=-1;
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length;j++) {
                if(i != j) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                } else {
                    continue;
                }
            }
            if(count >= maxCount) {
                index = i;
                maxCount = count;
            }
            count = 0;
        }
        if(count<(array.length/2)) {
            System.out.println("0");
        }else {
            System.out.println(array[index]);
        }
    }
}
```
