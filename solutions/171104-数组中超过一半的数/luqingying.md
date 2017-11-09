```JavaScript
    var arr = [23,12,1,34,116,8,18,37,56,50];
    function sequence(a,b){
        if (a>b) {
            return 1;
        }else if(a<b){
            return -1
        }else{
            return 0;
        }
    }
    document.write(arr.sort(sequence));
    if(arr.length/2==0){
        var l = arr.length;
        if(arr[l/2]===arr[l/2-1]){
                  document.write(arr[l/2]);
          }
        else
                document.write("0");
    }
    else{
    var count;

    }
```