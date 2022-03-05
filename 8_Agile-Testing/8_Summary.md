# Agile Testing

### Software Development Life Cycle
## Definisi SDLC
Proses yang digunakan untuk mendesain, develop dan mengujikan suatu software.
### Tahapan SDLC
Reqs. Gathering -> Design -> Development -> Testing -> Deployment -> Maintenance.

Reqs. Gathering
- Menentukan business requirements
- Proses diagram
- Analisa mendalam

Design
- Desain infrastruktur & arsitektur
- Desain system model

Development
- Develop infrastruktur & arsitektur
- Develop code

Testing 
- Membuat dan mengeksekusi test cases

Deployment
- Deploy kepada user
- Mulai mengoperasikan sistem

Maintenance
- Support system
- Support maintenance
- Perubahan dan penyesuaian system

## Agile Testing Manifesto
1. Testing througout
Testing secara berkala berarti testing dilakukan beriringan pada saat development.
2. Prevent bugs
Dengan melakukan menentukan requirements yang tepat, clean code dan code review.
3. Testing understanding
Seorang tester tidak hanya melakuakan pengujian fungsional namun harus paham dengan kebutuhan user.
4. Build the best system
Tester harus memiliki POV seorang User yang mana dapat memberikan masukan kepada developer.
5. Team responsibility for quality
Pada saat ada bugs yang ditemukan, tidak semestinya hanya dibebankan kepada QA yang mungkin kurang teliti namun juga dibebankan bersama sama kepada developer.

### Testing Pyramid
        *                       
      * UI *
     *Service*
    *Unit Test*
   ************* 
   
          ***
        * *** *
       *       *                       
      *   UI    *
     *Integration*
    *  Unit Test  *
   ***************** 