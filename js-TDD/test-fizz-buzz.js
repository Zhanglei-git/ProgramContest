var assert = require('chai').assert;
var fizzBuzz = require('./fizz-buzz');

describe('testFizz', function () {
    it('return FIZZ when input num is 3', function () {
        assert.equal('FIZZ', fizzBuzz(3));
    });
});

describe('testBuzz', function () {
    it('return BUZZ when input num is 5', function () {
        assert.equal('BUZZ', fizzBuzz(5));
    });
});

describe('testFizzBuzz', function () {
    it('return FizzBUZZ when input num is 15', function () {
        assert.equal('FIZZBUZZ', fizzBuzz(15));
    });
});