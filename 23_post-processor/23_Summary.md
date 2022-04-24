### Post Processor
>Poin Poin yang dipelajari
1. Post Processor
2. JSON Extractor
3. Summary

>Post Processor
```
Post Processor adalah sebuah elemen pada test plan yang digunakna untuk melakukan beberapa aksi setelah melakukan proses permintaan sampel.

Post processor biasanya digunakan untuk mengekstrak beberapa nilai dari sebuah respon sampel, seperti kita dapat mengekstrak nilai dari variable sesi HTTP Request dan mengirim variabel sesi ke subsequent request.
```

>JSON Extractor
```
JSON Extractor digunakan untuk mengekstrak nilai dari JSON Response. JSON adalah sebuah simple text yang biasanya digunakan untuk bertukar informasi antara client dan server.

Saat Anda perlu mengekstrak nilai dari respons JSON dan meneruskan ke beberapa permintaan lain dalam skrip JMeter, Anda dapat menggunakan JSON Extractor. Ini adalah pasca-prosesor. Seperti yang saya jelaskan di posting saya sebelumnya, pasca-prosesor berjalan setelah menerima respons dari server dan kemudian melakukan tugas seperti mengekstraksi nilai dinamis dll. Ekstraktor JSON bertindak dengan cara yang sama.
```

Summary
```
JMeter Post-Processors are the heart of Performance Testing
```