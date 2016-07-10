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

describe('testInvalidInputData', function () {
    it('return Invalid Input Data when input num is 4.5', function () {
        assert.equal('Invalid Input Data', fizzBuzz(4.5));
    });
});

describe('testInvalidInputData', function () {
    it('return Invalid Input Data when input num is undefined', function () {
        assert.equal('Invalid Input Data', fizzBuzz());
    });
});