@LoginPage
Feature: Home Page

  @Check
  Scenario: Check Login Page
    Given Enes is on Home page
    When click "Giris Yap" card in the top rigt
    Then should see Login Page

  @Email @Components
  Scenario: Check Email Components
    Given Enes is on Login Page
    When click "E-Posta" radio button
    Then should see "GİRİŞ YAP" title
    Then should see "E-Posta" radio button
    Then should see "Telefon" radio button
    Then should see "E-Posta Adresiniz" text on Email
    Then should see "Şifreniz" text on Password
    Then should see Show Password Icon
    Then should see "Beni hatırla" remember me
    Then should see "Şifremi Unuttum" forgot password
    Then should see "GIRIŞ YAP" login button

  @Phone @Components
  Scenario: Check Phone Components
    Given Enes is on Login Page
    When click "Telefon" radio button
    Then should see "GİRİŞ YAP" title
    Then should see "E-Posta" radio button
    Then should see "Telefon" radio button
    Then should see Phone Text Box
    Then should see "Şifreniz" text on Password
    Then should see Show Password Icon
    Then should see "Beni hatırla" remember me
    Then should see "Şifremi Unuttum" forgot password
    Then should see "GIRIŞ YAP" login button

  @Empty
  Scenario Outline: Empty Login
    Given Enes is on Login Page
    When click login button
    Then should see "<emailErr>" Email Empty message
    Then should see "<passErr>" Password Empty message
    Examples:
      | emailErr                           | passErr                   |
      | Lütfen e-posta adresinizi giriniz. | Lütfen şifrenizi giriniz. |

  @Empty @Password
  Scenario Outline: Empty Password
    Given Enes is on Login Page
    When type Email "<email>"
    When click login button
    Then should see "<passErr>" Password Empty message
    Then should not see Email Empty message
    Examples:
      | email         | passErr                   |
      | enes@mail.com | Lütfen şifrenizi giriniz. |

  @Empty @Email
  Scenario Outline: Empty Email
    Given Enes is on Login Page
    When type Password "<pass>"
    When click login button
    Then should see "<emailErr>" Email Empty message
    Then should not see Password Empty message
    Examples:
      | pass       | emailErr                           |
      | 1234567890 | Lütfen e-posta adresinizi giriniz. |

  @False @Password
  Scenario Outline: False Email
    Given Enes is on Login Page
    When type Email "<email>" and click login
    Then should see "<passErr>" Email False message
    Examples:
      | email              | passErr                                    |
      | enes@mail@mail.com | Lütfen geçerli bir e-posta adresi giriniz. |

  @FalseLogin
  Scenario Outline: False Login
    Given Enes is on Login Page
    When type Email "<email>", Password "<password>" and click login
    Then should see "<err>" Login Error message
    Examples:
      | email         | password | err                                                       |
      | enes@mail.com | 1234562     | Lütfen E-posta Adresinizi ya da Şifrenizi Kontrol Ediniz. |