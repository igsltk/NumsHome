# NumsHome

## All math methods in RESTful app

### How to use
All requests have params.
* Simple Mathematical operations
	* /api/sum?a={num1}&b={num2}
	* /api/sub?a={num1}&b={num2}
	* /api/div?a={num1}&b={num2}
	* /api/mod?a={num1}&b={num2}
* Trigonometric Operations
	* /api/cos?a={num}
	* /api/sin?a={num}
	* /api/tan?a={num}
	* /api/ctan?a={num}
* Hash Creation
	* /api/hash?hashType={hashType}&textToHash={textToHash}
* Function Operations
	* /api/discriminant?b={b}&a={a}&c={c}
* Randomizer
	* /api/rand
	* /api/rand/fromto?min={min}&max={max}
	* /api/rand/fixed?numOfSimbols={numOfSimbols}