data= [ 

 {    
student_data:{      name:'A',      id: 123,      marks:[{'hi':11,'mt':22,'en':20}]    
}  
}

,
  
{    student_data:{      name:'B',      id: 124,      marks:[{'hi':12,'mt':20,'en':10}]    
 }  
}, 
 
{    student_data:{      name:'C',      id: 125,      marks:[{'hi':12,'mt':22,'en':23}]    } 
 
}
];

Output{  '123': {    name: 'A',    total_marks: 52  },  '124': {    name: 'B',    total_marks: 56  },  '125': {    name: 'C',    total_marks: 57  }}

function input(studentdata){
const arr=[];
studentdata.forEach(function(data){
var sum=0;
var mark=data.student_data.marks[0].values();
for(var i=0;i<mark.length;i++){
sum=sum+mark[i];

}
let hashMap=new Map();
hashMap['data.student_data.id']={
name:'data.student_data.name',
total_marks:sum;

}
arr.unshift(hashMap);


})
return arr;
}
input(data)
 

