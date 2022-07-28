<script>
    import Button from '../lib/Button.svelte'
    import InputField from '../lib/form/InputField.svelte'
    import CheckBox from '../lib/form/Checkbox.svelte'
    import Divider from '../lib/Divider.svelte'
    import Icon from '../lib/Icon.svelte'
    import Search from '../lib/Search.svelte'
    import Tabs from '../lib/tab/Tabs.svelte'
    import Tab from '../lib/tab/Tab.svelte'
    import Card from '../lib/card/Card.svelte'
    import CardHeader from '../lib/card/CardHeader.svelte'
    import CardContent from '../lib/card/CardContent.svelte'
    import CardActions from '../lib/card/CardActions.svelte'
    // import AppHeader from '../lib/AppHeader.svelte'
    import AppFooter from '../lib/AppFooter.svelte'
    import Banner from '../lib/Banner.svelte'
    import Select from '../lib/form/Select.svelte'
    import Radio from '../lib/form/Radio.svelte'
    import Menu from '../lib/Menu.svelte'
    import Chips from '../lib/Chips.svelte'
    import DatePicker from '../lib/form/DatePicker.svelte'
    import Dialog from '../lib/Dialog.svelte'
    import Snackbar from '../lib/Snackbar.svelte'
    import Paginator from '../lib/Paginator.svelte'
    import Spinner from '../lib/Spinner.svelte'
    import LanguageSelector from '../lib/LanguageSelector.svelte'
    import LightDarkModeSwitcher from '../lib/LightDarkModeSwitcher.svelte'
    import Heading from '../lib/heading/Heading.svelte'
    import SubHeading from '../lib/heading/SubHeading.svelte'
</script>

<Heading text="Welcome to the library!"></Heading>
<SubHeading text=""></SubHeading>
<p>This is a library of all component options</p>

<section class="page library">
    <Banner></Banner>
    <Heading text="This is a Heading"></Heading>
    <SubHeading text="This is a SubHeading"></SubHeading>
    <Divider></Divider>
    <Button>Button</Button>
    <Icon size="l"></Icon>

    <Card></Card>
    <CardHeader></CardHeader>
    <CardContent></CardContent>
    <CardActions></CardActions>

    <Tabs></Tabs>
    <Tab></Tab>

    <Search></Search>
    <Paginator></Paginator>

    <InputField></InputField>
    <Select></Select>
    <CheckBox></CheckBox>
    <Radio></Radio>
    <Menu></Menu>
    <Chips></Chips>
    <DatePicker></DatePicker>

    <Dialog></Dialog>
    <Snackbar></Snackbar>
    <Spinner></Spinner>

    <LanguageSelector></LanguageSelector>
    <LightDarkModeSwitcher></LightDarkModeSwitcher>
</section>

<style lang="scss">
  @import "../styles/theme";

  .library {
    display: flex;
    flex-direction: column;
    gap: 1rem;
    margin-top: 2rem;
  }

</style>