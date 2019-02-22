mono-repo multi-module proof-of-concept using Java, JavaScript, and Python

purpose: to screen scrape and visually compare info about potential employers

root project: poc

sub projects:

- consumer - (Java process) perists results to the database
- dispatcher - (Java library) runs Python producer processes to gather results
- producer - (Python process) screen scrapes websites to gather results
- query-server (Java Servlet) handles webui requests
- webui - (JavaScript browser app) prompts for search criteria, queries results
