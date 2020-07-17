---
weight: 3
title: "Intellij Idea - For Java developers"
---
# Intellij Idea - For Java developers

Idea has some available tips by default: 
    - *Tip of the day* or *Productivity Guide* from Help menu
    - *Pro Tips* from help: https://www.jetbrains.com/help/idea/pro-tips.html

Here you'll find tips that are encountered in day to day life of Java devs

## General default behaviour

1. Learn default settings, try to avoid *over customization*.

1. Do not version IDE specific files.

1. *CARET* is the little blinking thing that you see when you type text.

1. In Idea placement of the caret = scope (*context*). And context will dictate what options will be available.

1. Use SSD for fast *intelli-sense*.

1. Standard navigation works: `Ctrl + Arrows`, `Ctrl + Shift + Arrows`, `End`, `Home`, etc.
    - In MacOS for *line* operations `Home` = `Cmd + Left` and `End` = `Cmd + Right` 
    - In MacOS for *word* operations `Ctrl + Left` = `Option + Left` and `Ctrl + Right` = `Option + Right` 

1. Code completion supports *Quick Doc*

1. Sync settings and plugins : https://www.jetbrains.com/help/idea/sharing-your-ide-settings.html
     - Jetbrains account
     - Git
     - Export / Import

## General features

1. Facets
    - https://www.jetbrains.com/help/idea/facet-page.html
    - JPA
    - Spring
    - Works on steroids if Datasource is configured and assigned

1. Schema support
    - You can use a schema to validate and edit json and yml files
    - ![Schema support](/howtos/intellijidea/json-yaml-schema.png)

1. Diff
    - Files from modules
    - Dirs from modules
       - Select 2 and `Ctrl + D` 
    - Against external files
       - Select 1 and `Ctrl + D`
    - `Right click` inside files : `Compare with Clipboard`
       - for selection
       - for entire file content
    
1. Integrated History
    - `Right click` inside files : `Local History`
    - `Right click` on any file or directory : `Local History`

1. Internal Terminal
    - `Right click` over any file and `Open in terminal`
    
1. `Right click` over any file and `Reveal in Finder`
    - Helps to open the file manager where the file is located and select the file

1. Bookmarks 
    - `F11` Toggle bookmarks
    - `Shift + F11` Open list of bookmarks 

1. Hold cursor over a button, link, icon, etc. to get a tooltip with name of the feature

1. Auto-re-index
    - IDE updates
    - Plugin updates
    - Corrupt indexes

1. File auto-save
    - Manual save still works, but useless

1. Help and documentation
    - Open online documentation
    - F1 Button in general view
    - Help button in popups, contextual info
       - how info is organized

1. *Open files with single click* and *Always select open files* features
![Auto-navigation and file selection](/howtos/intellijidea/open-selected.png)

1. [Smart keys](https://www.jetbrains.com/help/idea/settings-smart-keys.html)
    - Use 'CamelHumps' words
    - Add multiple carets on double Ctrl with arrow keys 
    - Jump outside closing bracket/quote with Tab when typing 
    - etc.

1. Breakpoints
    - Toggle
        - `Left click on the line`
        - `Ctrl + F8`
    - Edit or set condition and open breakpoints window
        - `Ctrl + Shift + F8`
    - When in debug, the panels have a `Disable breakpoints button`

1. Support for `@Nullable`, with default highlight level set to `Warning`

1. Auto-contracts, deduced from method declaration: `@Nullable` vs `@NotNull`
    - An icon will appear at the line level to show the contract

## Plugins

1. **Plugin:** Presentation assistant

1. **Plugin:**  IntelliLang
    - *Auto activated*
    - `Ant + Enter` inside the content where custom language is present
    - https://www.jetbrains.com/help/idea/using-language-injections.html
    - Language injections

1. **Plugin:** Docker Integration
    - Advanced UI like Kitematic
    - Detection of dockerfiles with Run support

1. **Plugin:** Git
    - Git log
    - Blame
    - Git-Undo per section of a file `Ctrl + Alt + Z`
    - Compare with

1. **Plugin:** Maven
    - Show basic phases only, and other settings
    - Run phases
    - Select multiple and run
    - Can be configured at project level and IDE level
    - By default has one integrated
    - If you change version of a plugin in pom.xml - Check the logs, IDEA could use the previous version of it
    - `Preferences - Build, Execution, Deployment - Build Tools - Maven - Ignored Files` - be aware of this list
    
1. **Plugin:** Maven Helper
    - Helps to manage dependencies - visually
    
1. **Plugin:** .ignore
    - Help manage `.ignore` files
    - With highlight support
    - Can generate ignore files for various platforms

1. **Plugin:** Database tools and SQL
    - Can CRUD database
    - Cannot change admin rights via UI
        - but can do it via SQL
    - Advanced table visualization features
    - For oracle Docker images you need to put in Username field: `sys as sysdba`
    - Tables are used for auto completion in SQL files from source code
    - `Tx:` setting should be considered
        - ![Important mention about Tx setting](/howtos/intellijidea/db-tx-type.png)

1. **Plugin:** Http client
    - https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html#viewingResponse
    - Supports composing of requests in a text way
    - Can use `.http`or `.rest` files
    - Can be configured via `rest-client.env.json` or `http-client.env.json`
        - Yet, somehow is limited
    - Have support for Spring controllers, just like Run button for routes

1. **Plugin:** Key Promoter X
    - https://plugins.jetbrains.com/plugin/9792-key-promoter-x/
    - Helps to learn shortcuts
    - When you do a mouse based action it'll give you the shortcut
    - If you do more times same action with mouse and there's no shortcut it'll propose to set one

## Settings

We distinguish 2 categories

1. IDE settings, applicable to all modules and IDE itself
1. Module level settings

Most of the settings described here are available on both levels

1. **Setting:** `Appearance and Behavior | System Settings -> Startup/Shutdown : Reopen last project on startup` 
1. **Setting:** `Editor / Inspections -> Java > Logging > Number of placeholders does not match number of arguments in logging call`
    - Set to warning, so that SLF4J shows if you have a missmatch between passed params and placeholders in the message.
1. **Setting:** `Editor / General -> Change font size with Ctrl/Command+Mouse Wheel`
    - Good to have it active in case you want quickly increase the size so that other can see better
1. **Setting:** `Ctrl + Shift + 8` Column mode on/off 
    - `Ctrl + Shift + A` type *Column mode*, hit `Enter`
    - `Alt + Shift + Mouse Left Click` : put carets under cursor
    - `Middle click + Hold + Drag` selection, for *non-Apple mouse* users 
    - [Working with *multiple carets*](https://www.jetbrains.com/help/idea/working-with-source-code.html#multiple_cursor)
1. **Setting:** `Editor / Code Style / Java -> Wrapping and Braces -> Group Declarations : Align fields in columns`
    - Group / align fields in one column and values after equals in other column
1. **Setting:** `Editor / Code Editing -> Highlight on Caret movement : Current scope`
    - Highlight the currently selected scope (*variable, function, class, etc.*)
1. **Setting:** `Editor / General / Smart Keys -> Surround selection on typing quote or brace`
    - The selected text get brackets or quotes instead of replacing
1. **Setting:** `Languages & Frameworks / SQL Resolution Scopes`
    - Map parts of your source code to specific SQL Databases configured in Intellij Idea
1. **Setting:** [File | Settings | Editor | Inlay Hints | Java -> Annotations -> Show Hints for -> Inferred Annotations](jetbrains://idea/settings?name=Editor--Inlay+Hints--Java)
    - ![Show inferred annotations inline](/howtos/intellijidea/show_inferred_annotations.png)
1. **Setting:** *Git-Bash* instead of *CMD*, only for Windows, `Tools / Terminal / Application settings - Shell path`
    - Set value to `"C:\Program Files\Git\bin\sh.exe" --login -i`, assuming that *git* is located under *C:\Program Files\Git*
    - All shell scripts will run with *git-bash* now
    - To revert change value to `cmd.exe`
    
### Within IDE

1. Bottom right corner : `4 spaces` change indentation
1. Bottom right corner : `Togle read only attribute` file

## Generation, completion and popup'ed information

1. `Alt + Enter` The smart contextual aware thing
    - swiss army knife for various contexts
    - can generate code for a lot of situations
    - have different options
    - underlined words like errors - are focused and first option of `Alt + Enter` is available by default
       - when a class is used but not imported and Idea knows it
    - `Alt + Enter, then Esc, then Alt + Enter` 
        - sometimes invoking `Alt + Enter` second time gives other options
    - `Ctrl + F1` Details on warning
        - when the caret is within an expression marked with warning background  
        - pressing twice will expand to show details
        - ![Issue details for marked expressions](/howtos/intellijidea/Cmd+F1.png)
1. `Ctrl + Space` Code completion
1. `Alt + Space` Quick definition, shows the implementation of the symbol
1. `F1` Quick documentation
1. `Ctrl + Alt + X then P` evaluate XML tag
    - put caret on tag
    - click first combination - nothing will happen
    - then click `P` and small pop over will show up
    - ![Evaluate XML tag](/howtos/intellijidea/Cmd+Alt+X_then_P.png)

1. `Ctrl + N` New File, Class, etc.
1. `Ctrl + Shift + N` New scratch file.
1. `Ctrl + J` Templates and Live templates support
    - you can have **"shortcut words"** (*like keywords at IDE level*) that'll generate a code for you
    - they can work for selected text as well on their own
    - ![Schema support](/howtos/intellijidea/live-templates.png)

## Navigation

1. **Navigation:** `Alt + F1` Select in...
    - Select the highlighted element in pretty much any context
1. **Navigation:** `F2` Goes to next issue
    - Next error, if there errors
    - Next warning, it there are no errors but are warnings
1. **Navigation:** `F4` Open module settings
    - Of the selected module
1. **Navigation:** `Shift + Shift` Search everywhere
    - `Ctrl + Shift + A` - Actions only
    - https://www.jetbrains.com/help/idea/searching-everywhere.html
1. **Navigation:** `Ctrl + Tab` Navigate in open tabs and panels
1. **Navigation:** `Ctrl + E` Navigate in recently closed files and panels
1. **Navigation:** `Esc` to go to the main Editor
    - Not consistent when using Split tabs
1. **Navigation:** `Shift + Esc` to go to the main Editor and close current panel
1. **Navigation:** `Ctrl + Alt + ←` (*leftwards arrow*) Go **back** to previous caret location
1. **Navigation:** `Ctrl + Alt + →` (*rightwards arrow*) Go **forward** to previous caret location
1. **Navigation:** `Ctrl + O` Open class
    - Press 2x to `Include non project files - the ones from libraries`
1. **Navigation:** `Ctrl + Shift + O` Open file
    - Press 2x to `Include non project files - the ones from libraries`

## Selection

1. **Selection:** `Ctrl + C` : WHEN NO SELECTION - Copy line
1. **Selection:** `Ctrl + X` : WHEN NO SELECTION - Cut line

1. **Selection:** `Alt + ↑`(*upwards arrow*) : multiple times
    - Select word
    - Select expression
    - Select whole line
    - special behaviour on code elements
1. **Selection:** `Alt + ↓`(*downwards arrow*) : multiple times
    - De-Select word
    - De-Select Expression
    - De-Select Whole line
    - special behaviour on code elements

## Edit
    
1. **Edit:** `Ctrl + Z` Undo 
1. **Edit:** `Ctrl + Alt + Z` Undo from Version Control System point of view 
1. **Edit:** `Ctrl + V` Paste 
1. **Edit:** `Ctrl + Shift + V` Paste from History 
1. **Edit:** `Ctrl + D` Duplicate line or selection
1. **Edit:** `Ctrl + Y` Delete line
1. **Edit:** `Ctrl + G` Select all occurrences of a word inside a file
    - so that you can edit the selection
    - very close to what `Shift + F6` does for symbols - limited to current file scope
1. **Edit:** `Ctrl + Alt + M` Extract method
    - Create a function from selection
1. **Edit:** `Ctrl + Alt + C` Introduce constant 
    - Create constant from selection
    - Move a hardcoded string or numeric value to a constant
1. **Edit:** `Ctrl + Shift + U` Change case 
1. **Edit:** `Ctrl + Shift + ↑`(_upwards arrow_) : move **statement** up
1. **Edit:** `Ctrl + Shift + ↓`(_downwards arrow_) : move **statement** down
1. **Edit:** `Alt + Shift + ↑`(_upwards arrow_) : move **line** up
1. **Edit:** `Alt + Shift + ↓`(_downwards arrow_) : move **line** down
1. **Edit:** `Ctrl + Alt + L` Reformat
    - Can be applied only to selected portion
    - Can be applied to a folder
1. **Edit:** `Ctrl + Alt + O` Optimize imports
    - Remove unused classes, ignore classes used in comments
    - Apply format rules for import statements 
    - Can be applied to a folder
1. **Edit:** `Shift + Enter` Start a new line under current one and move caret to it
1. **Edit:** `Ctrl + Enter` Split current line, move the content after the caret to a new line
1. **Edit:** `F5` Refactor - copy class
    - When file is selected in **Project** view or cursor is placed inside a name of a class (*incl. inner classes*)
1. **Edit:** `F6` Refactor - move class
    - When file is selected in **Project** view or cursor is placed inside a name of a class (*incl. inner classes*)
1. **Edit:** `Shift + F6` Refactor - rename class name
    - When a class is selected in **Project** view or cursor is placed inside a class name
    - When a folder or package is selected in **Project** view
        - You might see these options if this package is present in other modules
        - Option *Rename package*: will consider **all packages** with same name in **all modules** 
        - Option *Rename folder*: will rename **only the current package** and will update `package` and all `imports` for the **current module**


Next: [Videos showing various features into Intellij Idea](/docs/how_tos/004_intellij_idea_videos/)
