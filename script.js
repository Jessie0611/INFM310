var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function () {
    /* Toggle between adding and removing the "active" class,
    to highlight the button that controls the panel */
    this.classList.toggle("active");

    /* Toggle between hiding and showing the active panel */
    var panel = this.nextElementSibling;
    if (panel.style.display === "block") {
      panel.style.display = "none";
    } else {
      panel.style.display = "block";
    }
  });
}

function palindrome(str) {
  str = str.toLowerCase().replace(/\s+/g, '');
  return str === str.split('').reverse().join('');
}
console.log(palindrome("hannah"));
console.log(palindrome("racecar"));
console.log(palindrome("never odd or even"))


function isPrime(n) {
  if (n <= 1) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      return false;
    }
  }
  return true;
}
console.log(isPrime(7));  // true
console.log(isPrime(4));  // false
console.log(isPrime(13)); // true
