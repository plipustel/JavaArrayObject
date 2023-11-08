# JavaArrayObject
 
<code>in React i can create array object like this:
 
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