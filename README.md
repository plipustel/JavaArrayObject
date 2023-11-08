##  Java Array Object
Implemented by: Plipus Tel <a href="https://www.plipus.tel.com" target="_blank">https://www.plipustel.com</a><p>

In React, it possible to create an array object like this, how would looks like in Java?
<code>
	const[cars, setCar] = useState(
	[{
		model: 'SUV',
		year:'2023',
		brand:'Toyota',
		audio:[{
				usb:true,
				bluetooh: true,
				radio:false,
			  }, {
				usb:true,
				bluetooh: false,
				radio:false,
				}]
	},
	{
		model: 'SUV',
		year:'2012',
		brand:'Rubicon',
		audio:[{
				usb:true,
				bluetooh: true,
				radio:true,
			  }, {
				usb:true,
				bluetooh: false,
				radio:true,
			}]
	 }
	])
 </code>