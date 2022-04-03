Feature: search test with DuckDuckGo.com

  Scenario: Search with https://duckduckgo.com/
    Given Page https://duckduckgo.com/ opened in browser
    When Search phrase entered in search input box
    And Clicked "search button"
    Then First 3 search results contain phrase "Adele"
