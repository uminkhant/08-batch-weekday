//pure function is not hv state
function add(a,b)P{
	return a+b;
}

//higher order function is take other function as param
function isEven(a){
	return a%2 === 0
}
function check(a) {
	console.log(a(34))
}
check(isEven)




// currying function in js
function add(a,b){
    return a+b;
}
console.log(add(2,8))
const addcurry = x => y => x+y 
console.log(addcurry(3)(4))



//recursion in js
let countDown = (num) => {
    if(num == 0){
        console.log("number is equal 0 ")
    }else{
        console.log("number is "+num)
        countDown(num-1)
    }
}
countDown(4)
