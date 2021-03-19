package com.clearurdoubt;

public class javascript {
    function filterTypes (values) {
    const result = {
                number: [],
        string: [],
        object: [],
        others: []
    }

        var c1 =0;
        var c2 = 0;
        var c3 = 0;
        var c4 = 0;

        for(var i = 0;i<values.length;i++){
            if(typeof values[i] == "number")
            result.number[c1++] = values[i]
      else if(typeof values[i] == "string")
            result.string[c2++] = values[i]
      else if(typeof values[i] == "object")
            result.object[c3++] = values[i]
      else
            result.others[c4++] = values[i]
        }


        return result;
}
