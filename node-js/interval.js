var counter = 1;
const func = function() {
  console.log("hello");
  counter+=1;
  if (counter === 6) {
    console.log("Done");
    clearInterval(intervalId);
  }
}
const intervalId = setInterval(func,1000);
