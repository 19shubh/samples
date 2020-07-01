const func = function(delay) {
  console.log("hello after "+delay+" seconds");
}
const timer1 = setTimeout(func,4*1000,4);
const timer2 = setTimeout(func,8*1000,8);

// clearTimeout(timer1);
// clearTimeout(timer2);
