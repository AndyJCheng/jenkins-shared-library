// send http request,form data

def request()｛
	def formData = [
		[name: 'field1',value: 'value1'],
		[name: 'field2', value: 'value2'],
		[name: 'file1', file: 'path/to/your/file1.txt'],
		[name: 'file2', file: 'path/to/your/file2.txt']
	 ]
	def response = httpRequest(
		url: url,
		httpMode: 'POST',
		contentType: 'MULTIPART_FORM_DATA',
		multipartData: formData,
		consoleLogResponseBody: true
	)
    	return response
}
