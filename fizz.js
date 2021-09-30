function fizzBuzz(number) {
  let output = '',
    c3 = 0,
    c5 = 0;
  for (let i = 1; i <= number; i++) {
    c3++;
    c5++;
    if (c3 == 3) {
      output += 'fizz';
      c3 = 0;
    }
    if (c5 == 5) {
      output += 'buzz';
      c5 = 0;
    }
    if (output != '') {
      console.log(output);
      output = '';
    } else {
      console.log(i);
    }
  }
}

fizzBuzz(100);
